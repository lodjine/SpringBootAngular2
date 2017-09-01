
var app = angular.module('meteoreApp',[]);

var ctrl = app.controller('formMagasinCtrl', function($scope, $window, LocaliteService){
	
	
	$scope.validationFct = function(){
		if ($scope.nom == "3" && $scope.adresse == "3" ){
			$window.location.href = '/accueil.html';
		}	
			$scope.message = "Erreur : adresse et/ou nom incorrect !";
		else {
			$window.location.href = '/accueil.html';
		}
	}
	
	$scope.annulerFct = function(){
		$window.location.href = '/accueil.html';
	}
	
	function saveLocalite(localite){
		LocaliteService.saveLocalite(localite);
	}
	
});