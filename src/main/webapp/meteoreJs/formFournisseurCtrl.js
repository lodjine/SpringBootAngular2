angular.module('meteoreApp').controller('formFournisseurCtrl', formFournisseurCtrl);

formFournisseurCtrl.$inject = [ '$scope', 'FournisseurService', '$window' , '$state', '$stateParams'];

function formFournisseurCtrl($scope, FournisseurService, $window, $state, $stateParams) {

	var idR = $stateParams.id;

	if (idR != null){
		$scope.fournisseur = FournisseurService.get({id:idR});
		
	}
	
	$scope.validationFct = function(fournisseur) {
		FournisseurService.save(fournisseur);
		$window.location.href = '/accueil.html#/listFournisseur';
	}

	$scope.annulerFct = function() {
		$window.location.href = '/accueil.html#/listFournisseur';
	}
};