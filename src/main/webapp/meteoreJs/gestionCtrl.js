angular.module('meteoreApp').controller('gestionCtrl', gestionCtrl);

gestionCtrl.$inject = [ '$scope', 'ProduitsService', '$window',
		'CategorieService', '$state', '$stateParams', 'listMagasinsService', 'QuantiteService' ];

function gestionCtrl($scope, ProduitsService, $window, CategorieService,
		$state, $stateParams, listMagasinsService, QuantiteService) {

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
	}
};

