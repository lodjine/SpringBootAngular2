angular.module('meteoreApp').controller('formProduitCtrl', formProduitCtrl);

formProduitCtrl.$inject = [ '$scope', 'ProduitFormService' ];

function formProduitCtrl($scope, ProduitFormService, $window) {

	var fr = $scope.produit.intitule;

	$scope.validationFct = function(produit) {
		$scope.message = "$scope.produit.intitule";
		ProduitFormService.save(produit);

		$window.location.href = "/accueil.html";
	}

};
