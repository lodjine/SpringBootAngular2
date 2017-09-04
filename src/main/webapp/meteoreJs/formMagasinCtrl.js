angular.module('meteoreApp').controller('formMagasinCtrl', formMagasinCtrl);

formMagasinCtrl.$inject = [ '$scope', 'MagasinFormService' ];

function formMagasinCtrl($scope, MagasinFormService, $window) {

	$scope.validationFct = function(magasin) {

		MagasinFormService.save(magasin);
		$window.location.href = '/accueil.html';

	}

};
