angular.module('meteoreApp').controller('formProduitCtrl', formProduitCtrl);

formProduitCtrl.$inject = [ '$scope', 'ProduitsService', '$window',
		'CategorieService', '$state', '$stateParams' ];

function formProduitCtrl($scope, ProduitsService, $window, CategorieService,
		$state, $stateParams) {

	$scope.categories = CategorieService.query();
	var idProduit = $stateParams.id;
	if (idProduit != null) {
		$scope.produit = ProduitsService.get({
			id : idProduit
		});
	}

	$scope.validationFct = function(produit) {

		ProduitsService.save(produit);
		$state.go("listProduits");
	}

	$scope.validationCategorie = function(categorie) {

		CategorieService.save(categorie);

		$state.reload();

	}

};

