document.addEventListener("DOMContentLoaded",function() {
  console.log('DOMContentLoaded');

  const doRetrieveButton = document.querySelector("#doRetrieveBtn");
  const moveToRegButton = document.querySelector("#moveToRegBtn");
  
  const pageNoInput     = document.querySelector("#pageNo");
  const searchDivSelect = document.querySelector("#searchDiv");
  const searchWordInput = document.querySelector("#searchWord");
  const pageSizeSelect  = document.querySelector("#pageSize");

  const userForm = document.querySelector("#userForm");
  doRetrieveButton.addEventListener('click', function(event){
    event.preventDefault();
    console.log("doRetrieveButton click");

    userForm.pageNo.value = 1;
    userForm.action = "/ehr/user/doRetrieve.do";

    userForm.submit();
  })

  moveToRegButton.addEventListener('click',function(event){
    event.preventDefault();
    console.log("moveToRegButton click");

    if(confirm('채팅방 생성 화면으로 이동하시겠습니까?') === false) return;

    window.location.href = "/ehr/chatroom/chatroom_reg_index.do";
  });
});