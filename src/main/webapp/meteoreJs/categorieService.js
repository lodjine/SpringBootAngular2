
(function() {
    'use strict';
    angular
        .module('meteoreApp')
        .factory('CategorieService', CategorieService);

    CategorieService.$inject = ['$resource'];

    function CategorieService ($resource) {
    	
    	var resourceUrl =  '/categories/:id';
    	return $resource(resourceUrl, {}, {

    	});
    	
    
        
    }
})();