(function() {
    'use strict';
    angular
        .module('meteoreApp')
        .factory('listMagasinsService', listMagasinsService);

    listMagasinsService.$inject = ['$resource'];

    function listMagasinsService ($resource) {
    	
    	var resourceUrl =  '/localites/:id';
    	return $resource(resourceUrl, {}, {});
    	
    
        
    }
})();