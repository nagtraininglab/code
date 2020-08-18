


// using DOM API

const greetingBtn=document.getElementById("greeting-btn")
const greetingBox=document.getElementById("greeting-box")


greetingBtn.addEventListener('click',e=>{
	
	fetch("/api/hello")
	.then(response=>response.text())
	.then(message=>{
		greetingBox.innerText=message
	})
	
})