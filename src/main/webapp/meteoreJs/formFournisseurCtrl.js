angular.module('meteoreApp').controller('formFournisseurCtrl', formFournisseurCtrl);

formFournisseurCtrl.$inject = [ '$scope', 'formFournisseurCtrl', '$window' ];

function formFournisseurCtrl($scope, formFournisseurCtrl, $window) {

	$scope.validationFct = function(fournisseur) {
		formFournisseurCtrl.save(fournisseur);
		$window.location.href = '/accueil.html#/listFournisseur';
	}

	$scope.annulerFct = function() {
		$window.location.href = '/accueil.html#/listFournisseur';
	}
};