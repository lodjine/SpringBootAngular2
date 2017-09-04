
(function() {
    'use strict';
    angular
        .module('meteoreApp')
        .factory('ProduitsService', ProduitsService);

    ProduitsService.$inject = ['$resource'];

    function ProduitsService ($resource) {
    	
    	var resourceUrl =  '/produits/:id';
    	return $resource(resourceUrl, {}, {

    	});
    	
    
        
    }
})();
