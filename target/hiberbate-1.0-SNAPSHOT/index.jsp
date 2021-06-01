<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Save product</h1>
    <form action="save-product" method="post">
        <label>Product name</label>
        <br/>
        <input type="text" name="productName"/>
        <br/>
        <label>price</label>
        <br/>
        <input type="text" name="price">
        <button type="submit">save</button>
    </form>
<br/>
</body>
</html>