<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

 <head>
    <meta charset="utf-8">
    <title>Home Page</title>
    
    <!--  CSS -->
    <link rel="stylesheet" href="./css/crud.css" />
    <link rel="stylesheet" href="./css/style.css" />
    <link rel="stylesheet" href="./bootstrap/bootstrap.min.css" />
    <link rel="stylesheet" href="./fontawesome/css/all.min.css" />
    
    <script type="text/javascript" src="./js/script.js"></script>
    
</head>


<body>

<div class="container">
	<nav class="container col-2">
	  <ul class="menu">
		  <li title="home"><a href="#" class="active home">home</a></li>
		  <li title="search"><a href="#" class="search">search</a></li>
		  <li title="pencil"><a href="#" class="pencil">pencil</a></li>
		  <li title="about"><a href="#" class="about">about</a></li>
		  <li title="archive"><a href="#" class="archive">archive</a></li>
		  <li title="contact"><a href="#" class="contact">contact</a></li>
	  </ul>
	</nav>

	<div class="container text-center mt-3">
	<h3>
       <a href="#" class="logo logo-admin"><img src="assets/images/logo.png" height="250" alt="logo"></a>
    </h3>
	
	<div class="panel-body container">
          <form method="post" enctype="multipart/form-data">
              <table style="width: 85%;">
              	<tr>
              		<td><label for="titre">Titre:</label></td>
              		<td><input type="text" name="titre" id="titre" class="form-control"/></td>
              	</tr>
              	<tr>
              		<td><label for="description">Catégorie:</label></td>
              		<td>
              			<select name="categorie" class="form-control">
              				<c:forEach items="${model.listecategorie }" var="cat">
              					<option value="${cat.id }">${cat.nom }</option>
              				</c:forEach>
              				
              			</select>
              		</td>
              	</tr>
              	<tr>
              		<td><label for="description">Description:</label></td>
              		<td><textarea name="description" id="description" class="form-control"> </textarea></td>
              	</tr>
              	<tr>
              		<td><label for="prix">Prix:</label></td>
              		<td><input type="text" name="prix" id="prix" class="form-control"/></td>
              	</tr>
              	<tr>
              		<td><label for="image">Image de menu:</label></td>
              		<td><input type="file" name="image" id="image" class="form-control"/></td>
              	</tr>

              </table>
		          <input type="submit" name="action" value="Enregistrer le menu" class="btn btn-primary mt-5" style="background-color: #d29f31; border: 1px solid white;"/>
              </form>
      </div>
      
	
	<div class="container">
    <div class="box">
        <div class="col-md-12">
            <div class="col-md-3 pull-right form-group has-feedback searchbox">
                <input type="text" class="form-control has-feedback-left" placeholder="Search here" >
            </div>
            <div class="pull-right">
                <button type="button" class="btn" style="background-color: #d19e30"><span class="fa fa-plus" aria-hidden="true"></span> ADD</button>
                <button type="button" class="btn" style="background-color: #d19e30"><span class="fa fa-trash-o" aria-hidden="true"></span> Delete</button>
            </div>
        </div>
        <table class="table table-striped">
            <thead>
                <th><input type="checkbox" ></th>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Birthday</th>
                <th>Phone</th>
                <th>Created Time</th>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                <tr>
                    <td><input type="checkbox"></td>
                    <td>#TODO</td>
                    <td>#TODO</td>
                    <td>#TODO</td>
                    <td>#TODO</td>
                    <td>#TODO</td>
                    <td>#TODO</td>
                    <td>
                        <span class="fa fa-edit" aria-hidden="true"><br><small>Edit</small></span>
                    </td>
                    <td>
                        <span class="fa fa-trash" aria-hidden="true"><br><small>Delete</small></span>
                    </td>
                </tr>
            </tbody>
        </table>
        
    </div>
</div>
	
	</div>
</div>






</body>
</html>
    