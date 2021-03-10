<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.80.0">
    <title>Simulacro 2 - Awakelab - Talento Digital</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/checkout/">

    

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/5.0/dist/css/bootstrap.min.css" rel="stylesheet" >

    <!-- Favicons -->
<link rel="apple-touch-icon" href="https://getbootstrap.com/docs/5.0/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="https://getbootstrap.com/docs/5.0/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="https://getbootstrap.com/docs/5.0/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="https://getbootstrap.com/docs/5.0/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="https://getbootstrap.com/docs/5.0/assets/img/favicons/safari-pinned-tab.svg" >
<link rel="icon" href="https://getbootstrap.com/docs/5.0/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#7952b3">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="https://getbootstrap.com/docs/5.0/examples/checkout/form-validation.css" rel="stylesheet">
  </head>
  <body class="bg-light">
    
<div class="container">
  <main>
    <div class="py-5 text-center">
      <img class="d-block mx-auto mb-4" src="https://getbootstrap.com/docs/5.0/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
      <h2>Simulacro 2</h2>
     
    </div>
 
 
      <div class="col-md-12 col-lg-12">
         
        <form action="detallefactura" method="post" class="needs-validation" novalidate>
  			<div class="row g-3">
  		   <div class="col-12">
              <label for="facturaid" class="form-label">Factura ID:</label>
              <input type="text" class="form-control" name="facturaid" placeholder="Por favor ingresar un id de factura" required>
              <div class="invalid-feedback">
                Por favor ingresar un id de factura.
              </div>
            </div>
 		</div>
		<hr class="my-4">
		
          <button class="w-100 btn btn-primary btn-lg" type="submit">Obtener</button>
        
        <div class="row g-3">
  		   <div class="col-3">
              Cliente:
            </div>
            <div class="col-9">
              <c:out value="${datfact.getCliente() }"></c:out>
            </div>
 		</div>
 		
 		<div class="row g-3">
  		   <div class="col-3">
              Fecha:
            </div>
            <div class="col-9">
              <c:out value="${datfact.getFecha() }"></c:out>
            </div>
 		</div>
 		
 		<div class="col-12">
	 			 <div class="table-responsive">
	        <table class="table table-striped table-sm">
	          <thead>
	            <tr>
	              <th>Producto</th>
	              <th>Precio</th>
	              <th>Cantidad</th>
	             
	            </tr>
	          </thead>
	          <tbody>
	          <c:forEach items="${ldetfact }" var="ldf" >
		          <tr>
		              <td><c:out value="${ldf.getNombreproducto() }"></c:out></td>
		              <td><c:out value="${ldf.getPrecio() }"></c:out></td>
		              <td><c:out value="${ldf.getCantidad() }"></c:out></td>       
		          </tr>
	            </c:forEach>
	            
	          </tbody>
	        </table>
	      </div>
 		</div>
        
        
 		
 		<div class="row g-3">
  		   <div class="col-3">
              Subtotal:
            </div>
            <div class="col-9">
              <c:out value="${datfact.getSubtotal() }"></c:out>
            </div>
 		</div>
 		
 		
 		<div class="row g-3">
  		   <div class="col-3">
              Impuesto:
            </div>
            <div class="col-9">
              <c:out value="${datfact.getImpuesto() }"></c:out>
            </div>
 		</div>
 		
 		<div class="row g-3">
  		   <div class="col-3">
              Total:
            </div>
            <div class="col-9">
              <c:out value="${datfact.getTotal() }"></c:out>
            </div>
 		</div>
        
        </form>
      </div>
    </div>
  </main>

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">&copy; 2017–2021 Company Name</p>
    <ul class="list-inline">
      <li class="list-inline-item"><a href="#">Privacy</a></li>
      <li class="list-inline-item"><a href="#">Terms</a></li>
      <li class="list-inline-item"><a href="#">Support</a></li>
    </ul>
  </footer>
</div>


    <script src="https://getbootstrap.com/docs/5.0/dist/js/bootstrap.bundle.min.js" ></script>

      <script src="https://getbootstrap.com/docs/5.0/examples/checkout/form-validation.js"></script>
  </body>
</html>
