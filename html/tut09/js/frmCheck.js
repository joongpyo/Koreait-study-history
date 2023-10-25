let userid = document.querySelector(".userid");
let passwd = document.querySelector(".passwd");
let button = document.querySelector("button");

    //페이지 로딩 후 실행되는 자바스크립트
    window.onload = () => {
        userid.focus();
        
    }


   /*버튼 클릭했을때 나오는 창*/

    //내부함수 방법
    //    button.onclick = function () {
    //         alert("ok");
    //    }

    //화살표 함수
    //    button.onclick = () => {
    //         alert("ok");
    //    }

    // button.addEventListener(이벤트, 함수);
        button.addEventListener('click', function(e){
                //alert("ok");
                //이벤트 발생 시 동작 처리
                e.preventDefault();

                if(userid.value == ""){
                    alert("아이디를 입력하세요")
                    userid.focus();
                    return false;
                }
        })


    
    //화살표 함수
        // button.addEventListener('click', ()=>{
        //         alert("ok");
        // })
    
    // input 버튼 누르면 다음 페이지로 이동 특징
        // button.addEventListener('click', (e)=>{
        //     e.preventDefault(); //을 막는다
        //     alert("ok");
        // })