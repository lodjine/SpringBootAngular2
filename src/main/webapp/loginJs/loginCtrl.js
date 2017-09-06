 
 angular.module('loginApp').controller('loginCtrl', loginCtrl);

 loginCtrl.$inject = [ '$scope', '$window', '$state'];

 function loginCtrl($scope, $window,$state) {

	 $scope.loginFct=function() {
		   if($scope.login=="admin" && $scope.password=="admin"){
			   $window.location.href = '/accueil.html#/pageUne';
		   }else{
			   $scope.message="login et/ou mot de passe erroné!";
		   }
	   }

 };