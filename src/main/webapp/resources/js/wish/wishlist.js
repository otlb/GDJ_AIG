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

    $.ajax({
        method:"post",
        url:"./wishDelete",
        traditional:true,
        data:{
            productNum:nums,
        },
        success:function(result){
           
            if(result.trim()>0){                
                location.reload();  

                // checkElement.forEach((element) => {
                //     $(element).parent().parent().parent().remove();
                // });                                 
            }
        },
        error:function(){
            alert("알수없는 에러 발생");
        }
    })
        

  });