angular.module('meteoreApp').controller('DialogCtrl', DialogCtrl);

DialogCtrl.$inject = [ '$scope', 'FournisseurService', '$window', '$state',
		'$stateParams', '$dialog', 'QuantiteService' ];

function DialogCtrl($scope, FournisseurService, $window, $state, $stateParams,
		$dialog, QuantiteService) {

	$scope.quantities = QuantiteService.query();

	$scope.edit = function(quantite) {
		$dialog.open();
	}

	$scope.validationQuantite(quantite) = function(quantite) {
		QuantiteService.save(quantite);
	}

};