angular.module('meteoreApp').controller('gestionCtrl', gestionCtrl);

gestionCtrl.$inject = [ '$scope', 'ProduitsService', '$window',
		'CategorieService', '$state', '$stateParams', 'listMagasinsService' ];

function gestionCtrl($scope, ProduitsService, $window, CategorieService,
		$state, $stateParams, listMagasinsService) {

	$scope.localites = listMagasinsService.query();
	
	

};

