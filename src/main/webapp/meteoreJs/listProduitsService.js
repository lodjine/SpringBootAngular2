
(function() {
    'use strict';
    angular
        .module('meteoreApp')
        .factory('listProduitsService', listProduitsService);

    listProduitsService.$inject = ['$resource'];

    function listProduitsService ($resource) {
    	
    	var resourceUrl =  '/produits/:id';
    	return $resource(resourceUrl, {}, {

    	});
    	
    
        
    }
})();
