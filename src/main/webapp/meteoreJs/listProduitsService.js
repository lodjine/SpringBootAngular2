angular.module('meteoreApp').factory('Produit', Produit);

Produit.$inject = [ '$resource' ];

function listProduits($resource) {
	var resourceUrl = '/produits';
	return $resource(resourceUrl, {}, {});

}