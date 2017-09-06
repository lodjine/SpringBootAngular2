angular.module('meteoreApp').controller('gestionCtrl', gestionCtrl);

gestionCtrl.$inject = [ '$scope', 'ProduitsService', '$window',
		'CategorieService', '$state', '$stateParams', 'listMagasinsService', 'QuantiteService' ];

function gestionCtrl($scope, ProduitsService, $window, CategorieService,
		$state, $stateParams, listMagasinsService, QuantiteService) {

	$scope.localites = listMagasinsService.query();
	
	$scope.selectLocalite= function(){
		var id = $scope.localite.idLocalite;
		$scope.localite=listMagasinsService.get({ id: id });		
		$scope.produits = QuantiteService.getQuantiteByLocalite({id});
	}
	


};

