"use client";

import { useState, useEffect } from "react";

export interface QuizQuestion {
  category: string;
  question: string;
  correct_answer: string;
  incorrect_answers: string[];
}

export const useQuizGame = (totalQuestion: number = 5) => {
  const [question, setQuestion] = useState<QuizQuestion | null>(null);
  const [options, setOptions] = useState<string[]>([]);
  const [selectedAnswer, setSelectedAnswer] = useState<string | null>(null);
  const [correctAnswer, setCorrectAnswer] = useState<string>("");
  const [result, setResult] = useState<string>("");
  const [correctScore, setCorrectScore] = useState<number>(0);
  const [askedCount, setAskedCount] = useState<number>(0);
  const [isQuizOver, setIsQuizOver] = useState<boolean>(false);
  const [loading, setLoading] = useState<boolean>(true);

  useEffect(() => {
    loadQuestion();
  }, []);

  const loadQuestion = async () => {
    setLoading(true);
    try {
      const res = await fetch("https://opentdb.com/api.php?amount=1");
      const data = await res.json();
      const q: QuizQuestion = data.results[0];

      const allOptions = [...q.incorrect_answers];
      const randomIndex = Math.floor(Math.random() * (q.incorrect_answers.length + 1));
      allOptions.splice(randomIndex, 0, q.correct_answer);

      setQuestion(q);
      setOptions(allOptions);
      setCorrectAnswer(q.correct_answer);
      setSelectedAnswer(null);
      setResult("");
    } catch {
      setResult("Errore nel caricamento della domanda.");
    } finally {
      setLoading(false);
    }
  };

  const decodeHTML = (text: string) => {
    const parser = new DOMParser();
    return parser.parseFromString(text, "text/html").documentElement.textContent || text;
  };

  const handleSelect = (option: string) => setSelectedAnswer(option);

  const checkAnswer = () => {
    if (!selectedAnswer) {
      setResult('<p><i class="fas fa-question"></i> Please select an option!</p>');
      return;
    }

    let newScore = correctScore;
    if (selectedAnswer === decodeHTML(correctAnswer)) {
      newScore++;
      setResult('<p><i class="fas fa-check"></i> Correct Answer!</p>');
    } else {
      setResult(
        `<p><i class="fas fa-times"></i> Incorrect Answer!</p>
         <small><b>Correct Answer:</b> ${correctAnswer}</small>`
      );
    }

    setCorrectScore(newScore);
    const newCount = askedCount + 1;
    setAskedCount(newCount);

    if (newCount === totalQuestion) {
      setTimeout(() => {
        setResult((prev) => prev + `<p>Your score is ${newScore}.</p>`);
        setIsQuizOver(true);
      }, 500);
    } else {
      setTimeout(() => {
        loadQuestion();
      }, 1500);
    }
  };

  const restartQuiz = () => {
    setCorrectScore(0);
    setAskedCount(0);
    setIsQuizOver(false);
    setResult("");
    loadQuestion();
  };

  return {
    question,
    options,
    selectedAnswer,
    correctScore,
    totalQuestion,
    isQuizOver,
    loading,
    result,
    decodeHTML,
    handleSelect,
    checkAnswer,
    restartQuiz,
  };
};
