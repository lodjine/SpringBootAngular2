
'use strict';

angular.module('meteoreApp').controller('listProduitsCtrl', listProduitsCtrl);

listProduitsCtrl.$inject = ['$scope', 'Produit'];

	function listProduitsCtrl($scope, Produit){
		$scope.listProduits=Produit.querry();
	}
  
};
 