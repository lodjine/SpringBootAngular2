angular.module('meteoreApp').controller('formProduitCtrl', formProduitCtrl);

formProduitCtrl.$inject = [ '$scope', 'ProduitsService' , '$window','CategorieService' ];

function formProduitCtrl($scope, ProduitsService, $window,CategorieService) {

		$scope.categories=CategorieService.query();
	
	
	
	$scope.validationFct = function(produit) {
		$scope.message = "$scope.produit.intitule";
		ProduitsService.save(produit);

		$window.location.href = "/accueil.html";
	}

};


	
	
	
