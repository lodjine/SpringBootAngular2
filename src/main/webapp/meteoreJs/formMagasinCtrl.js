angular.module('meteoreApp').controller('formMagasinCtrl', formMagasinCtrl);

formMagasinCtrl.$inject = [ '$scope', 'MagasinFormService' ];

function formMagasinCtrl($scope, MagasinFormService) {
	$scope.message = "bla";

	$scope.validationFct = function(magasin, $window) {

		MagasinFormService.save(magasin);
		$window.
		
	}

};
