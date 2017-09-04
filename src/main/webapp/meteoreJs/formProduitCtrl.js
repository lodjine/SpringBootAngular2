angular.module('meteoreApp').controller('formProduitCtrl', formProduitCtrl);

formProduitCtrl.$inject = [ '$scope', 'ProduitsService' , '$window','CategorieService', '$state', '$stateParams' ];

function formProduitCtrl($scope, ProduitsService, $window,CategorieService,$state, $stateParams) {

		$scope.categories=CategorieService.query();
	var idProduit=$stateParams.id;
	if(idProduit != null){
		$scope.produit= ProduitsService.get({id:idProduit});
	}
	
	
	$scope.validationFct = function(produit) {
		$scope.message = "$scope.produit.intitule";
		                                     
		ProduitsService.save(produit);
		$window.location.href = '/accueil.html#/listProduits';
	}

};


	
	
	
