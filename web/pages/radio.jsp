<%-- 
    Document   : radio
    Created on : Jan 30, 2019, 4:52:43 PM
    Author     : zawadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

 
Try me<input type="radio" class="rdios"   />

 

<script>
    $('.rdios').change(function () {
        alert('The radio is changed');
    });



</script>

