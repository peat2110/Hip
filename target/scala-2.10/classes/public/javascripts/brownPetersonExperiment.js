var questionTime = 5000;
var countDownTime = 5000;
var flashTime = 5000;
var answerTime = 5000;
var startTimer = setInterval(function() {startTimerFunction()},3000);
var countdownTimer = 0;
var flashTimer = 0;
var answerTimer = 0;
var finTimer = 0;
var expDuration = 0;
var d;
var isStore = 0;
function startTimerFunction(){
        clearInterval(startTimer);
        document.getElementById("word1").innerHTML="ABC";
        document.getElementById("word2").innerHTML="CDF";
        document.getElementById("word3").innerHTML="ASDASD";
        countdownTimer = setInterval(function() {countDownTimerFunction()},questionTime);
}

function countDownTimerFunction(){
    clearInterval(countdownTimer);
	document.getElementById("word1").innerHTML="";
	document.getElementById("word2").innerHTML="";
	document.getElementById("word3").innerHTML="";
    document.getElementById("counter").style.visibility = "visible";
    flashTimer = setInterval(function() {flashTimerFunction()},countDownTime);
}

function flashTimerFunction(){
        clearInterval(flashTimer);
        document.getElementById("counter").style.visibility = "hidden";
        document.getElementById("hopRabbit").style.visibility = "visible";
    	answerTimer = setInterval(function() {answerTimerFunction()},flashTime);
}

function answerTimerFunction(){
        clearInterval(answerTimer);
        document.getElementById("hopRabbit").style.visibility = "hidden";
        document.getElementById("text1").disabled = false;
    	document.getElementById("text2").disabled = false;
    	document.getElementById("text3").disabled = false;
    	document.getElementById("text4").disabled = false;
    	document.getElementById("SubmitButton").disabled = false;
    	finTimer = setInterval(function() {finishTimerFunction()},answerTime);
    	d = new Date();
    	expDuration = d.getTime();

}

function finishTimerFunction(){
        clearInterval(finTimer);
        document.getElementById("text1").disabled = true;
        document.getElementById("text2").disabled = true;
        document.getElementById("text3").disabled = true;
        document.getElementById("text4").disabled = true;
        d = new Date();
        expDuration = d.getTime()-expDuration;
        isStore = 1;
}

function submitButtonClick(){
     if (isStore == 0){
        d = new Date();
        expDuration = d.getTime()-expDuration;
        document.getElementById("text4").value = (expDuration/1000);
        isStore = 1;
     }
     document.getElementById("text5").value = expDuration;
}

