angular.module('meteoreApp').controller('formMagasinCtrl', formMagasinCtrl);

formMagasinCtrl.$inject = [ '$scope', 'MagasinFormService', '$window' ];

function formMagasinCtrl($scope, MagasinFormService, $window) {

	$scope.validationFct = function(magasin) {
		MagasinFormService.save(magasin);
		$window.location.href = '/accueil.html#/listMagasins';
	}

	$scope.annulerFct = function() {
		$window.location.href = '/accueil.html#/listMagasins';
	}
};
