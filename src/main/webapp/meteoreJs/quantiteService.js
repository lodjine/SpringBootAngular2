(function() {

    'use strict';
    angular
        .module('meteoreApp')
        .factory('QuantiteService', QuantiteService);

    QuantiteService.$inject = ['$resource'];

    function QuantiteService ($resource) {
    	
    	var resourceUrl =  '/quantites/:id';
    	return $resource(resourceUrl, {}, {
    			
    		'getQuantiteByLocalite':{
    			method : 'GET',
    			isArray : true,
    			url: '/selectMagasins/:id'
    		}
    				
    	});
    	
    
        
    }

})();