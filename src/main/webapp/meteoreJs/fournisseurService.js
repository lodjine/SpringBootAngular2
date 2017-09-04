(function() {
    'use strict';
    angular
        .module('meteoreApp')
        .factory('FournisseurService', FournisseurService);

    FournisseurService.$inject = ['$resource'];

    function FournisseurService ($resource) {
    	
    	var resourceUrl =  '/fournisseurs/:id';
    	return $resource(resourceUrl, {}, {});
    	
    }
})();