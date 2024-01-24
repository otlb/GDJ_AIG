<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- ${whis.productNum}
${whis.userName}    --%> 

<script type="text/javascript">
    $('#wish').click(function(){
    fetch("./detail",{
        method:"GET"
    })
    .then(res=>res.text)
    .then((res=>{ console.log(res)}))
})

</script>


</body>
</html>