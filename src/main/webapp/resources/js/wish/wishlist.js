$('#checkAll').click(()=>{
    let v = $("#checkAll").prop("checked");
    
    $('.checks').prop("checked", v);
  });
  
  $('.checks').click(function(){
    let flag=true;
    
    $('.checks').each(function(idx, c){
        
        if(!$(c).prop('checked')){
            flag=!flag;
            return false;
        }
    });
  
    $("#checkAll").prop("checked", flag);
  })

  //체크한 찜목록 지우기
  $('#del').click(function(){
    let nums = [];
    let checkElement =[];

        $('.checks').each(function(idx,c){
            if($(c).prop('checked')){
               nums.push($(c).val());
               checkElement.push(c);
            }
        });

    deleteWithJquery(nums);
    //deleteWithFetch(nums);    

  });

  function deleteWithFetch(nums){
    // let param ="";
    // nums.forEach(element => {
    //     param=param+"productNum="+element+"&";
    // });

    let deleteForm = document.getElementById("deleteForm");

    let form = new FormData(deleteForm);

    fetch("./wishDelete",{
        method:"POST",
        headers:{
            "Content-type":"application/x-www-form-urlencoded"
        },
        body:param
       // body:form
    })
    .then(response=> response.text())
    .then(response=> {
        console.log(response);
        $("#ajaxList").html(response);
    })

  }

  function deleteWithJquery(nums){

    let form = new FormData($("#deleteForm")[0]);
    $.ajax({
        method:"post",
        url:"./wishDelete",
        traditional:true,
        contentType:false,
        processData:false,
        data:form,
        //data:{
           // productNum:nums,           
        //},
        success:function(result){
           
            if(result.trim()>0){                
                location.reload();  
                
                // Element들 삭제
                // checkElement.forEach((element) => {
                //     $(element).parent().parent().parent().remove();
                // });
                
                //db에서 다시 조회
                $("#ajaxList").html(result.trim);
                
            }
        },
        error:function(){
            alert("알수없는 에러 발생");
        }
    })
  }


$("#add").click(function(){
    $("#deleteForm").attr("action","../account/join")
    $("#deleteForm").submit();


});