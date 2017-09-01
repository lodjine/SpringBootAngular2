/**
 * 
 */
var app = angular.module('meteoreApp');

var ctrl = app.controller('formMagasinCtrl', function($scope,$window){
	
	$scope.validationForm()=function(){
		if ($scope.nom.length > 3 && $scope.adresse.length > 10 ){
			$window.location.href = '/accueil.html';
		}	
			$scope.message = "Erreur, adresse et/ou nom incorrect !";
		else {
			$window.location.href = '/accueil.html';
		}

	}
	
	$scope.annuler()=function(){
		$window.location.href='/accueil.html';
	}
});