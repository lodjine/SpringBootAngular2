angular.module('meteoreApp').controller('DialogCtrl', DialogCtrl);

DialogCtrl.$inject = [ '$scope', 'FournisseurService', '$window' , '$state', '$stateParams','$dialog'];

function DialogCtrl($scope, FournisseurService, $window, $state, $stateParams,$dialog) {

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
	
	
	$scope.item = item;
	  
	  $scope.save = function() {
	    dialog.close($scope.item);
	  };
	  
	  $scope.close = function(){
	    dialog.close(undefined);
	  };
};