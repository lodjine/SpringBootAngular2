(function() {
    'use strict';
    angular
        .module('meteoreApp')
        .factory('ProduitFormService', ProduitFormService);

   ProduitFormService.$inject = ['$resource'];

    function ProduitFormService ($resource) {
    	
    	var resourceUrl =  '/produits/:id';
    	return $resource(resourceUrl, {}, {});
    	
    }
})(); 