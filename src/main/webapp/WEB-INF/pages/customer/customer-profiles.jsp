<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Customer Profiles!!!!!!!!!!!!!!!</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Basic Table</h2>
  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>            
  <table class="table">
    <thead>
      <tr>
        <th>Fid</th>
        <th>Name</th>
        <th>Email</th>
        <th>Doe</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${customerProfileVOsList}" var="item" varStatus="pp">
      <tr>
        <td>${pp.count}</td>
        <td>${item.name}</td>
       <td>${item.email}</td>
        <td>${item.doe}</td>
       </tr>
      </c:forEach>
      <tr>
        <td>&nbsp;</td>
<td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        
      </tr>
      
       <tr>
        <td>&nbsp;</td>
<td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        
      </tr>
      
       <tr>
        <td>&nbsp;</td>
<td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        
      </tr>
       <tr>
        <td>&nbsp;</td>
<td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        
      </tr>
      
    </tbody>
  </table>
</div>

</body>
</html>
