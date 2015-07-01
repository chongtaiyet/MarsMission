/**
 * Created by chongtaiyet on 7/1/15.
 */
var services = angular.module('services', ['ngResource']);

services.factory('Itinerary', ['$resource',
    function($resource){
        return $resource('../itinerary', {}, {
            query: {method:'GET'}
        });
    }]);