angular.module('meteoreApp').controller('formMagasinCtrl', formMagasinCtrl);

formMagasinCtrl.$inject = [ '$scope', 'MagasinFormService' ];

function formMagasinCtrl($scope, MagasinFormService, $window) {

	var fr = $scope.magasin.nom;

	$scope.validationFct = function(magasin) {
		$scope.message = "$scope.magasin.nom";
		MagasinFormService.save(magasin);

		$window.location.href = "/accueil.html";
	}

};
