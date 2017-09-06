angular.module('meteoreApp').controller('DialogCtrl', DialogCtrl);

DialogCtrl.$inject = [ '$scope', 'FournisseurService', '$window', '$state',
		'$stateParams', '$dialog', 'QuantiteService', 'listMagasinsService' ];

function DialogCtrl($scope, FournisseurService, $window, $state, $stateParams,
		$dialog, QuantiteService, listMagasinsService) {

	$scope.edit(quantite) = function(quantite) {
		$dialog.open();
	}

	$scope.validationQuantite(quantite) = function(quantite) {
		QuantiteService.save(quantite);
	}

};