angular.module('meteoreApp').controller('formMagasinCtrl', formMagasinCtrl);

formMagasinCtrl.$inject = [ '$scope', 'MagasinFormService', '$window' ];

function formMagasinCtrl($scope, MagasinFormService, $window) {
	$scope.message = "bla";

	$scope.validationFct = function(magasin) {
		MagasinFormService.save(magasin);
		$window.location.href = '/accueil.html';
	}

	$scope.annuler = function() {
		$window.location.href = "/accueil.html";
	}

};
