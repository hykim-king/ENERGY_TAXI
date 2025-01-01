document.addEventListener("DOMContentLoaded",function() {
  console.log("DOMContentLoaded");

  const contentInput = document.querySelector("#content");
  const chatContainer = document.getElementById("chat-container");

  const sendChatBtn = document.querySelector("#sendChat");
  sendChatBtn.addEventListener("click",function(event){
    event.preventDefault();
    console.log("sendChatBtn click");
    
    const content = contentInput.value;
    if(content){

      const messageElement = document.createElement('div');
      messageElement.textContent = `${sessionId}: ${content}`;
      chatContainer.appendChild(messageElement);

      const userId = sessionStorage.getItem('userId');

      

      $.ajax({
        type: "POST",
        url: "/ehr/chat/sendChat.do",
        async: true,
        dataType: "html", //form 보낼 땐 html 쓴다고 생각하면 됨
        data: {
          "content" : content,
          "userId" : userId
        },
        success: function(response) {
            console.log("success response:" + response);
            const message = JSON.parse(response);        
            
            contentInput.value = '';
        },
        error: function(response) {
            console.log("error:" + response);
        }
    });

    }
  })
});