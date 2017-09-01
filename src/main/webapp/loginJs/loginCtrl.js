
var app=angular.module('loginApp');

 var ctrl=app.controller('loginCtrl', function($scope,$window) {
	 
   $scope.loginFct=function() {
	   if($scope.login=="admin" && $scope.password=="admin"){
		   $window.location.href = '/accueil.html';
	   }else{
		   $scope.message="login et/ou mot de passe erroné!"
	   }
   }
   
});