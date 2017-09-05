angular.module('meteoreApp', [ 'ui.bootstrap' ]).controller('DialogCtrl',DialogCtrl);





function ListCtrl($scope, $dialog) {
	
	
	$scope.produit.nom = "bob";
	
	$scope.quantite.valeur = 2;
	
	
	$scope.quantities = [ {
		name : 'Produit',
		value : 'nom'
	}, {
		name : 'Quantité',
		value : 'valeur'
	}, {
		name : 'baz',
		value : 'baz value'
	} ];

	var dialogOptions = {
		controller : 'EditCtrl',
		templateUrl : 'DialobBox.html'
	};

	$scope.edit = function(quantite) {

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
}
// the dialog is injected in the specified controller
function EditCtrl($scope, quantite, dialog) {

	$scope.quantite = quantite;

	$scope.save = function() {
		dialog.close($scope.quantite);
	};

	$scope.close = function() {
		dialog.close(undefined);
	};
}