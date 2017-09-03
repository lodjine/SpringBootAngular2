
angular.module('meteoreApp').controller('listMagasinsCtrl', listMagasinsCtrl);

listMagasinsCtrl.$inject = ['$scope', 'MagasinListService'];

	function listProduitsCtrl($scope, MagasinListService){
		$scope.listProduits=Produit.querry();
	}
  
};
 