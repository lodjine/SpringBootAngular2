angular.module('meteoreApp').controller('formMagasinCtrl', formMagasinCtrl);

formMagasinCtrl.$inject = [ '$scope', 'MagasinFormService', '$window', '$state' ];

function formMagasinCtrl($scope, MagasinFormService, $window, $state) {

	$scope.validationFct = function(magasin) {
		MagasinFormService.save(magasin);
		$state.go("listMagasins");
	}

	$scope.annulerFct = function() {
		$state.go("listMagasins");
	}
};
