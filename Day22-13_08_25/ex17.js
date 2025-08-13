let questions = [
  {
    text: "What is the capital of Andhrapradesh?",
    choices: ["Hyderabad", "Amaravathi", "Vijayawada", "Vishakapatanam"],
    answer: 1 
  },
  {
    text: "Which planet is called the blue Planet?",
    choices: ["Earth", "Mars", "Jupiter", "Saturn"],
    answer: 0 
  },
  {
    text: "Who is called father of physics?",
    choices: ["Charles Dickens", "William Shakespeare", "Galileo Galilei", "Jane Austen"],
    answer: 2
  }
];
let current = 0;
let score = 0;
let answered = false; 


let questionEl = document.getElementById("question");
let optionsEl = document.getElementById("options");
let feedbackEl = document.getElementById("feedback");
let scoreEl = document.getElementById("score");
let nextBtn = document.getElementById("nextBtn");


function showQuestion() {
  answered = false;
  feedbackEl.textContent = ""; 

  let q = questions[current];
  questionEl.textContent = q.text;
  optionsEl.innerHTML = ""; 

  
  q.choices.forEach(function(choice, index) {
    let btn = document.createElement("div");
    btn.textContent = choice;
    btn.className = "option";
    btn.onclick = function() { checkAnswer(index); };
    optionsEl.appendChild(btn);
  });
}


function checkAnswer(choiceIndex) {
  if (answered) return; 
  answered = true;

  if (choiceIndex === questions[current].answer) {
    feedbackEl.textContent = "Correct!";
    score++;
    scoreEl.textContent = score;
  } else {
    feedbackEl.textContent = "Wrong!";
  }
}


nextBtn.onclick = function() {
  current++;
  if (current < questions.length) {
    showQuestion();
  } else {
    questionEl.textContent = "Quiz Finished!";
    optionsEl.innerHTML = "";
    feedbackEl.textContent = "Final Score: " + score + "/" + questions.length;
    nextBtn.disabled = true;
  }
};
showQuestion();