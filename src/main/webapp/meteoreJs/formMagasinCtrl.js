/**
 * 
 */
var app = angular.module('meteoreApp');

var ctrl = app.controller('formMagasinCtrl', function($scope, $window){
	$scope.message="";
	$scope.validationForm = function(){
		if ($scope.nom == "3" && $scope.adresse == "3" ){
			$window.location.href = '/accueil.html';
		}	
			$scope.message = "Erreur : adresse et/ou nom incorrect !";
		else {
			$window.location.href = '/accueil.html';
		}
	}
	
	$scope.annuler = function(){
		$window.location.href = '/accueil.html';
	}
});