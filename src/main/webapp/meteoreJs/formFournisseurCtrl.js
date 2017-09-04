angular.module('meteoreApp').controller('formFournisseurCtrl', formFournisseurCtrl);

formFournisseurCtrl.$inject = [ '$scope', 'FournisseurService', '$window' ];

function formFournisseurCtrl($scope, FournisseurService, $window) {

	$scope.validationFct = function(fournisseur) {
		FournisseurService.save(fournisseur);
		$window.location.href = '/accueil.html#/listFournisseur';
	}

	$scope.annulerFct = function() {
		$window.location.href = '/accueil.html#/listFournisseur';
	}
};