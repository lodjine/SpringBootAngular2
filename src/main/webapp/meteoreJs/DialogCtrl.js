angular.module('meteoreApp').controller('DialogCtrl', DialogCtrl);

DialogCtrl.$inject = [ '$scope', 'FournisseurService', '$window', '$state',
		'$stateParams', '$dialog' ];

function DialogCtrl($scope, FournisseurService, $window, $state, $stateParams,
		$dialog, QuantiteService) {

	$scope.quantities = QuantiteService.query();

	$scope.edit = function(quantite) {

		$dialog.open();

		var quantiteToEdit = quantite;

		$dialog.dialog(angular.extend(dialogOptions, {
			resolve : {
				quantite : angular.copy(quantiteToEdit)
			}
		})).open().then(function(result) {
			if (result) {
				angular.copy(result, quantiteToEdit);
			}
			quantiteToEdit = undefined;
		});
	};

	$scope.item = item;

	$scope.save = function() {
		dialog.close($scope.item);
	};

	$scope.close = function() {
		dialog.close(undefined);
	};
};