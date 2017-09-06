angular.module('meteoreApp').controller('gestionCtrl', gestionCtrl);

gestionCtrl.$inject = [ '$scope', 'ProduitsService', '$window',
		'CategorieService', '$state', '$stateParams', 'listMagasinsService', 'QuantiteService', 'ProduitsService' ];

function gestionCtrl($scope, ProduitsService, $window, CategorieService,
		$state, $stateParams, listMagasinsService, QuantiteService, ProduitsService) {

	$scope.localites = listMagasinsService.query();
	
	$scope.selectLocalite= function(localite){
		var id = $scope.localite.idLocalite;
		$scope.localite=listMagasinsService.get({ id: id });		
		$scope.produits = QuantiteService.getQuantiteByLocalite({id});
	}
	
	$scope.modifier = function(quantite){
		$scope.quantite = quantite;
	}
	
	$scope.validationQuantite = function(quantite) {
		var c = $scope.commande;
		var q = $scope.quantite.quantite;
		var f = c + q;
		$scope.quantite.quantite = f;		
		QuantiteService.save(quantite);
		$scope.commande = null;
	}
	
	$scope.creer = function(localite){
		$scope.localite = localite;
		$scope.produitss = ProduitsService.query();
		
	}
	
	$scope.create = function(quantite){
		QuantiteService.save(quantite);
	}
};

